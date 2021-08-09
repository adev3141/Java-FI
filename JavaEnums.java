public class JavaEnums {
    public static void main(String args[]){
        EasyPaisa ali = new EasyPaisa();
        ali.dept = EasyPaisa.Department.finance;
        System.out.println(ali.dept);
    }
}
class EasyPaisa{
    enum Department{finance, banking, operation, IT };
    Department dept;

}

