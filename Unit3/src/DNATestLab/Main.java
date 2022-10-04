package DNATestLab;

public class Main {

    public static void main(String[] args) {
        
        String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
        String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
	    String patient3 = "CACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTAGTCAGGACCGAGTACCAGTACGATCAGACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGTCAGGACGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATC";

     
        DNASequences dna1 = new DNASequences("Patient1", patient1);
        DNASequences dna2 = new DNASequences("Patient2", patient2);
        DNASequences dna3 = new DNASequences("Patient3", patient3);

        System.out.print(
            dna1 + "" +
            dna2 + "" +
            dna3 + ""
        );    
    }
}