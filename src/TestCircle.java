public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 =new Circle(1.5,"red");
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        /*
        ket luan:
        private : bao loi
        protective : khong can viet ham ke thua van chay
        Khong co access modifier : van chay.
        public : khoi noi roi.
        ket luan tiep: theo ket qua dat dc thi neu khong khoi tao package thi java ngam hieu la cac class
        chung 1 package, nen protective va khong co access modifier deu chay.
         */
    }
}
