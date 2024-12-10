import java.util.Scanner;

public class CBCC {
    private String masocb, hoten;
    protected float hesoluong;
    int namsinh;

    public CBCC() {
        masocb = "CB01";
        hoten = "Nguyen Van A";
        hesoluong = 1.0f;
        namsinh = 1990;
    }

    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so CB: ");
        masocb = scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = scanner.nextLine();
        System.out.println("Nhap he so luong: ");
        hesoluong = scanner.nextFloat();
        System.out.println("Nhap nam sinh: ");
        namsinh = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "CBCC{" +
                "masocb='" + masocb + '\'' +
                ", hoten='" + hoten + '\'' +
                ", hesoluong=" + hesoluong +
                ", namsinh=" + namsinh +
                '}';
    }

    public float tienLuong(){
        return 0;
    }
    public void in(String ThongTin){System.out.println(this.toString());
    }
}
