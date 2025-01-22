package study.algo250122;

public class Main {

    static class SuperObject {
        public void paint(){
            draw();
        }

        public void draw(){
            draw();
            System.out.println("Super Object");
        }
    }
    static class SubObject extends SuperObject {
        public void paint(){
            super.draw();
        }

        public void draw(){
            System.out.println("Sub Object");
        }
    }

        public static void main(String[] args){
            SuperObject a = new SubObject();
            a.paint();
        }

}
