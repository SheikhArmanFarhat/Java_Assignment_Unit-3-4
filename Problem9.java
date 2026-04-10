class Problem9 {

    int id;
    String name;

    Problem9(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        Problem9 s = new Problem9(101, "Prajwal");

        System.out.println(s.toString());
    }
}
