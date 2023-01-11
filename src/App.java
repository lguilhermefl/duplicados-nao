public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = {"Morango", "Uva", "Acerola", "Manga"};
        String[] array2 = {"Pêra", "Caju", "Morango", "Manga"};

        System.out.println("Valores duplicados nos arrays:");
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }

        }
    }
}
