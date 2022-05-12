public class Book {
    private String title;
    private int numofpages;
    private int year;
    public Book(String bookname,int pages,int pubyear){
        title = bookname;
        numofpages = pages;
        year=pubyear;
            }
            public String getName(){
                return title;
            }
            public int getpages(){
               return numofpages;
            }
            public int getpubyear(){
                return year;
            }
            public String toString(){
                String s;
                s= getName()+ " , "+getpages()+" , "+ getpubyear();
                return s;
            }
}
