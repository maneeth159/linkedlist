package javaa;
public class linkedList{
	int data;
	linkedList next;
	linkedList(int data){
		this.data=data;
		this.next=null;
	}
	public linkedList insert(linkedList head)
	{
		linkedList temp=head;
		if(head==null)
			{head=this;
				return head;
			}
		while (temp.next!=null)
			temp=temp.next;
		temp.next=this;
		return head;
		
	}
	
	public linkedList reverse(linkedList head)
	{
		linkedList temp;
		if (head==null|| head.next==null)
			return head;
		temp=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
	public void display(linkedList head)
	{
		linkedList temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
			
		}
	}
	public int middle()
	{
		linkedList t1=this;
		linkedList t2=this;
		while(t1!=null)
		{
			if(t1.next!=null)
			{
				t1=t1.next.next;
				t2=t2.next;
			}
			if(t1!=null && t1.next==null)
				break;
		}
		return t2.data;
	}
	public boolean cycle()
	{
		linkedList t1=this;
		linkedList t2=this.next;
		while(t1!=null && t2!=null)
		{
			if(t1==t2)
				return true;
			t1=t1.next;
			t2=t2.next.next;
		}
		return false;
		
	}
}