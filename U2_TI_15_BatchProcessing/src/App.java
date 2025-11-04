import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final ArrayQueue<Job> queue = new ArrayQueue<>();
    private static final ArrayStack<Job> stack = new ArrayStack<>();
    private static final SinglyLinkedList<Job> log = new SinglyLinkedList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Batch Processor - ingresa comandos (END para terminar).");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            if (processCommand(line.trim())) break;
        }
    }

    private static boolean processCommand(String raw) {
        String cmd = raw.trim();
        cmd = cmd.replaceAll("\\s+", " ").trim();
        if (cmd.isEmpty()) return false;

        String[] parts = cmd.split(" ");
        String action = parts[0].toUpperCase();

        switch (action) {
            case "ADD":
                if (parts.length < 2) {
                    System.out.println("Falta ID de trabajo");
                } else {
                    String id = parts[1];
                    queue.enqueue(new Job(id));
                }
                break;

            case "PROCESS":
                if (parts.length < 2) {
                    System.out.println("PROCESS requiere un número");
                } else {
                    try {
                        int n = Integer.parseInt(parts[1]);
                        processN(n);
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido en PROCESS");
                    }
                }
                break;

            case "COMMIT":
                commit();
                break;

            case "ROLLBACK":
                if (parts.length < 2) {
                    System.out.println("ROLLBACK requiere un número");
                } else {
                    try {
                        int m = Integer.parseInt(parts[1]);
                        rollback(m);
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido en ROLLBACK");
                    }
                }
                break;

            case "PRINT":
                printState();
                break;

            case "END":
                printFinalState();
                return true;

            default:
                System.out.println("Comando desconocido: " + action);
        }
        return false;
    }

    private static void processN(int n) {
        if (n <= 0) return;
        int k = Math.min(n, queue.size());
        for (int i = 0; i < k; i++) {
            Job j = queue.dequeue();
            if (j != null) stack.push(j);
        }
    }

    private static void commit() {
        while (!stack.isEmpty()) {
            Job j = stack.pop();
            if (j != null) log.addLast(j);
        }
    }

    private static void rollback(int m) {
        if (m <= 0) return;
        List<Job> reverted = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Job j = log.removeLast();
            if (j == null) break;
            reverted.add(j); 
        }
        for (int i = reverted.size() - 1; i >= 0; i--) {
            queue.enqueueFront(reverted.get(i));
        }
    }

    private static void printState() {
        System.out.println("QUEUE (pendientes): " + queue);
        System.out.println("STACK (procesando): " + stack);
        System.out.println("BITÁCORA (confirmados): " + log);
    }

    private static void printFinalState() {
        System.out.println("=== ESTADO FINAL ===");
        printState();
    }
}
