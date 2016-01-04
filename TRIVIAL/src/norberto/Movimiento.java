package norberto;

import com.sun.media.sound.SimpleSoundbank;

import carlos.Casilla;
import carlos.Equipo;

public class Movimiento {

    
	
	
	
	
	
	// MÉTODOS	
	public  void moverDer(Equipo x, int dado, Casilla [][] pos)
	{
		
		int[]num=identifiCasilla(x, pos);
		for (int i=0; i<dado; i++)
		{
			switch (x.getNumEquipo())
			{
			  case 1: 
				    x.getPosEq()= pos[num[0]][num[1]+1].getPosEq1();
			  break;
			
			  case 2:
				    x.getPosEq()= pos[num[0]][num[1]+1].getPosEq2();
		      break;
		      
			  case 3:
				    x.getPosEq()= pos[num[0]][num[1]+1].getPosEq3();
			  break;
			  
			  case 4:
				    x.getPosEq()= pos[num[0]][num[1]+1].getPosEq4();
			  break;
			  default:
				    System.out.println("Equipo no existente.");
			  break;	
			}
			
		}
		
		
	}
	
	public void moverIzq()
	{
		
	}
	
	
	public void moverNor()
	{
		
	}
	
	public void moverSur()
	{
		
	}

	
	public int[] identifiCasilla(Equipo uno, Casilla[][] pos)
	{
		int posit[]=new int[2];		
		boolean salir= false;
		for(int i=0; i<pos.length&&salir==false; i++)
		{
			if (uno.getPosEq()[i].equals(pos[i][0].getPosEq1()[0]))
			{	
			   for(int j=0;j<pos[i].length&&salir==false; i++)
			  {
				if (uno.getPosEq()[j].equals(pos[i][j].getPosEq1()[1]))	
				{
					posit[0]=j;
					posit[1]=i;
					salir=true;
				}
				
			  }
			   
		    }
			
	     }	
		return posit;
	 }
		
}
