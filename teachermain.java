public class teachermain {
    public static void main(String[] args) {
        Professor P1 = new Professor("professor",101);
        Assistant_Professor P2 = new Assistant_Professor("Assistant_Professor", 102);
        Associate_Professor P3 = new Associate_Professor("Associate_Professor", 103);

        P1.display();
        P2.display();
        P3.display();
    }
}
