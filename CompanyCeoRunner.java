class  CompanyCeoRunner{
    public static void main(String[] args) {
        Company company=new Company("Infosys",1234,"bangalore",2000);
        System.out.println("printing company details");
        System.out.println(company.getName());
        System.out.println(company.getCity());

        Ceo ceo = new Ceo("nandan",100000.0f,"bangalore");
        company.setCeo(ceo);
        
        Ceo ceo1=company.getCeo();
        System.out.println("printing company's ceo details");
        System.out.println(ceo1.getName());
        System.out.println(ceo1.getCity());
        System.out.println(ceo1.getSalary());
    }
}