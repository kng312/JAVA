package gen;

//Box<Apple , Box<Banana , Orange>
public class Box <L , R> {
	//���׸��� ���� ����
	//�빮�� �ϳ��� ����
	public L obj_left;
	public R obj_right;
	
	public void set(L l_obj, R r_obj)
	{
		this.obj_left = l_obj;
		this.obj_right = r_obj;
	}
	public R getRight()
	{
		return obj_right;
	}
	
	public L getLeft()
	{
		return obj_left;
	}
	

}
