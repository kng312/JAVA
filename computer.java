package isahasa;

public class computer {
	
	public computer() 
	{
		 
		 Mmemory = new memory[1];
		 Mcpu = new cpu[1];
		 
		 Mmemory[0] = new memory();
		 Mcpu[0] = new cpu();
		 
	
	}
	
	public computer(int cpu_count, int mem_count)
	{
		Mmemory = new memory[mem_count];
		Mcpu = new cpu[cpu_count];
		
		for(int i = 0; i < mem_count; i++)
		{
			Mmemory[i] = new memory();
		}
		for(int i = 0; i < cpu_count; i++)
		{
			Mcpu[i] = new cpu();
		}
	}
	
	memory[] Mmemory;
	cpu[] Mcpu;
	
}
