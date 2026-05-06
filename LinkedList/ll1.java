
import java.util.*;
public class ll1 {

//NODE FORMATION
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static node head;
    public static node tail;
    static Scanner sc=new Scanner(System.in);

//METHOD 1
    public static void addFirstNode(int d){
        node n=new node(d);
        if(head==null){
            head=tail=n;
            return;
        }
        n.next=head;
        head=n;
    }

//METHOD 2
    public static void addLastNode(int data){
        node n=new node(data);
        if(head==null){
            head=tail=n;
            return; 
        }
        tail.next=n;
        tail=n;
    }

//METHOD 3
    public static void addMiddleNode(int data,int index){
        node n=new node(data);
        if(index==0){
            addFirstNode(data);
            return;
        }
        node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        n.next=temp.next;
        temp.next=n;
    }

//METHOD 4
    public static void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }System.out.println("null");
    }

//METHOD 5
        public static int size(){
            node temp=head;
            int c=0;
            while(temp!=null){
                temp=temp.next;
                c++;
            }return c;
        }

//METHOD 6
    public static void removeFirstNode(){
       head=head.next;
        
    }

//METHOD 7
    public static int linearSearch(int key){
        node temp=head;
        int i=1;
        while(temp!=null){
            if(temp.data==key){System.out.print("element found at ");
            return  i;}
            temp=temp.next;
            i++;
        }return -1;
    }

//METHOD 8
public static void reverseLL(){
    node prev=null;
    node curr=head;
    node next=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}

//METHOD 9
    public static void removeLast(){
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

//METHOD 10
    public static void removeAtPos(int index){
        node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    
//METHOD 11
    public static void insertAtPos(int data,int index){
        node n=new node(data);
        node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }

//METHOD 12
    public static void enterNodes(){
        System.out.println("how many nodes you want : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int d=sc.nextInt();
            node newNode=new node(d);

            if(head==null){
                head=tail=newNode;
            }else{
                node temp=head;
               while(temp.next!=null){
                temp=temp.next;
               }
               temp.next=newNode;
            }
        }
    }

//METHOD 13
    public static void insertInSorted(int data){
        node n=new node(data);
        node temp=head;
        if(n.data<head.data){
            n.next=head;
            head=n;
            return;
        }
        while(n.data>temp.next.data){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }



//MAIN METHOD
    public static void main(String[] args) {
        
     /*   addFirstNode(10);
       addFirstNode(20);
       addLastNode(40);
       addLastNode(50);
       addMiddleNode(30,2);
       display();
       System.out.println(size());
       removeFirstNode();
       display();
       System.out.println(linearSearch(50));
       reverseLL();
       display();
       removeLast();
       display();
       removeAtPos(2);
       insertAtPos(54, 2);
       display(); */
       enterNodes();
       display();
       insertInSorted(30);
       display();

    }
}
