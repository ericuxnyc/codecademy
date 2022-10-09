public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        int atg = dna.indexOf("ATG");
        int tga = dna.indexOf("TGA");
        int difference  = atg - tga;
        if(dna.contains("ATG") && dna.contains("TGA") && difference % 3 == 0){
            String protein = dna.substring(atg+3, tga);
            System.out.println(protein);
        } else {
            System.out.println("No protein");
        }


    }
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //   / \   \   / \   \
    //  ~   `-~ `-`   `-~ `-
    //System.out.println(dna.length());
}
