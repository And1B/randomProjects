public class DNA {
// This program determines whether there is a protein in a strand of DNA

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1;
//    System.out.println(dna.length());
        String protein = dna.substring(3, dna.length() - 3);
        if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && protein.length() % 3 == 0){
//      System.out.println("Test: " + protein);
            System.out.println("Success");
        } else {
            System.out.println("No protein");
        }

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

    }
}
