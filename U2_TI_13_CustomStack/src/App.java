public class App {
    public static void main(String[] args) throws Exception {
        String text1 = "Anita lava la tina";
        String text2 = "Hola";

        System.out.println("\"" + text1 + "\" → " + isPalindrome(text1));
        System.out.println("\"" + text2 + "\" → " + isPalindrome(text2));
    }

    public static boolean isPalindrome(String text) {
        // Limpiamos el texto: sin espacios, signos ni mayúsculas
        String clean = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                clean += c;
            }
        }

        // Usamos nuestra pila personalizada
        ArrayStack<Character> stack = new ArrayStack<>();

        // Empujar caracteres
        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        // Reconstruir la palabra al sacar los elementos
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Comparar original y reverso
        return clean.equals(reversed);
    }
}
