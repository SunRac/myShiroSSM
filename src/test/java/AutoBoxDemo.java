import java.util.Scanner;

/**
 * @author java_shj
 * @desc    自动装箱练习
 * @createTime 2019/11/18 16:55
 **/
public class AutoBoxDemo {
    public static void main(String[] args) {
//        scannerUse();
//        autoBox();
        testPrintAndPrintEffeciency();
    }

    private static void scannerUse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一句话：按Enter键结束："+"\n");
        String line = scanner.nextLine();
        System.out.println(line);
    }

    private static  void autoBox(){
        Integer i1 = 300;
        int i2 = 300;
        Integer i3 = 300;
        System.out.printf("装箱类型和基本类型==，拆箱比较基本类型：%b \n",i1==i2);
        System.out.printf("装箱类型==，拆箱比较基本类型：%b \n",i1==i3);
    }
    //default 包一级访问权限，没意思，只是想用下
   static void testPrintAndPrintEffeciency(){
        long lStart = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            System.out.println("行：" + i) ;
        }
        long lend = System.currentTimeMillis();
        System.out.println("打印100次，println用时：" + (lend-lStart));

        long fStart = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            System.out.printf("第%d行： \n", i) ;
        }
        long fend = System.currentTimeMillis();
        System.out.println("打印100次，printf用时：" + (fend-fStart));
    }
}
