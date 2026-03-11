

public class Q1 {
    public static void main(String[] args) {
        pen p=new pen();
        System.out.println("This is the properties of pen p");
        p.setColour("red");
        System.out.println(p.getColour());
        p.setTip(19);
        System.out.println(p.getTip());
        p.slno[0]=2;
        p.slno[1]=9;
        p.slno[2]=6; 
        p.slno[3]=4;
        p.slno[4]=3;
        for(int i=0;i<=4;i++){
        System.out.print(p.slno[i]); }

        System.out.println();

        pen p1=new pen();
        System.out.println("This is the properties of pen p1");
        p1.setColour("yellow");
        System.out.println(p1.getColour());
        p1.setTip(7);
        System.out.println(p1.getTip());

        pen p2=new pen(p);
        System.out.println("This is the properties of pen p2 copied from p");
        p2.setColour("pink");
        System.out.println(p2.getColour());
        System.out.println(p2.getTip());
        System.out.println(p.getColour());
        for(int i=0;i<=4;i++){
        System.out.print(p2.slno[i]); }
        System.out.println();
        p2.slno[2]=0;
        System.out.println(p.slno[2]);

        p.a=15;
        System.out.println(p.a);

        System.out.println(pen.a);

      
    }
}
class pen {
private String colour;
static int a=10;
int tip;
int slno[]=new int[5];
pen(){
    System.out.println("Constructor is called...");
}

pen(pen p){
    this.colour=p.colour;
    this.tip=p.tip;
    for(int i=0;i<slno.length;i++){
       this.slno[i]=p.slno[i];
     }

}
String getColour(){
return this.colour;}

int getTip(){
return this.tip;}

void setColour(String colour){
    this.colour=colour;}

void setTip(int tip){
    this.tip=tip;}

}