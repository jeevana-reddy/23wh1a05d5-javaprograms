package Programs;

public class datatypes_methodOverloading {
    
    
    public void print(char c) {
        System.out.println("Character: " + c);
    }

    
    public void print(boolean flag) {
        System.out.println("Boolean: " + flag);
    }

    
    public void print(int num) {
        System.out.println("Integer: " + num);
    }

    public static void main(String[] args) {
        datatypes_methodOverloading obj = new datatypes_methodOverloading();
        
        obj.print('A');     
        obj.print(true);    
        obj.print(123);     
    }
}
