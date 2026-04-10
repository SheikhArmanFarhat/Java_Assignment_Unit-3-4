class Problem5 {
    public static void main(String[] args) {

        String fileName = "report.pdf";

        int dotIndex = fileName.lastIndexOf(".");

        String extension = fileName.substring(dotIndex + 1);

        System.out.println("File Extension: " + extension);
    }
}
