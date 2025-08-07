public class CommpanyRunner {
    public static void main(String[] args){
        Company company=new Company("infosys",3496,"bengaluru",2000);
        System.out.println(company.getName());
        System.out.println(company.getId());
        System.out.println(company.getCity());
        System.out.println(company.getNumberOfEmployee());

        Company company1=new Company("wipro",3456,"bengaluru",1000);
        System.out.println(company1.getName());
        System.out.println(company1.getId());
        System.out.println(company1.getCity());
        System.out.println(company1.getNumberOfEmployee());
    }
}
