class Problem7 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");     
        sb.insert(5, " Java");    

        sb.reverse();             

        System.out.println("Final Text: " + sb);
    }
}
