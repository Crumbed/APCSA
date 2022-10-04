package DNATestLab;

public class DNASequences {
    
    private String patientDNA;
    private String patientName;

    public DNASequences(String name, String dna) {
        patientName = name;
        patientDNA = dna;
    }

    public boolean hasHowletts() {
        if (patientDNA.contains("ACGTTCGAGATCGA")) { return true; }
        return false;
    }

    public boolean hasParkers() {
        if (patientDNA.contains("GTACCAGTACGATCAG")) { return true; }
        return false;
    }

    public boolean hasBanners() {
        if (patientDNA.contains("CGTAGATCATGACGA")) { return true; }
        return false;
    }

    public boolean hasDanvers() {
        int half = patientDNA.length() / 2;
        String thisPatientDNA = patientDNA.substring(half);
        if (thisPatientDNA.contains("ACTGGTCA")) { return true; }
        return false;
    }

    public boolean hasStarks() {
        if (patientDNA.contains("GATCGATGTGCAGACTAGCGAT")) { return true; }
        return false;
    }

    public boolean hasRomanovas() {
        if (patientDNA.contains("GTCAGGAC")) {
            String thisPatientDNA = patientDNA.replaceFirst("GTCAGGAC", "");
            if (thisPatientDNA.contains("GTCAGGAC")) { return true; }
        }
        return false;
    }

    public String toString() {
        return "\nDNA results for: " + patientName + "\n" +
        "Howlett's: " + hasHowletts() + "\n" +
        "Parker's: " + hasParkers() + "\n" +
        "Banner's: " + hasBanners() + "\n" +
        "Danver's: " + hasDanvers() + "\n" +
        "Stark's: " + hasStarks() + "\n" +
        "Romanova's: " + hasRomanovas() + "\n";
    }

}