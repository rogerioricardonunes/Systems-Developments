
public class Piramede {
	
	  public static void main(String args[]) {
		  escalarPiramede();
	  }
	  	/*metodo para percorrer os os vetores e cada linha da piramede ordenando do maior para o menor 
	  	  para fazer a soma final.*/
		  private static void escalarPiramede(){
			  int linha1 [] =    {4}; 
			  int linha2 [] =   {3,4};
			  int linha3 [] =  {6,5,7};
			  int linha4 [] = {4,1,8,3};
			  	
			  int soma = 0;
			  boolean flag; 

		        do{  
		            flag = false; 
		            //laço de repetição for para percorrer o vetor e ordenar do menor para o maior.
		            for(int i = 1; i < linha1.length; i++){  
		                if(linha1[i - 1] > linha1[i]){  
		                    int temp = linha1[i -1];  
		                    linha1[i - 1] = linha1[i];  
		                    linha1[i] = temp;  
		                    flag = true;  
		                }  
		            }  
		        }while (flag);  
		         		       
		        do{  
		            flag = false;  
		            //laço de repetição for para percorrer o vetor e ordenar do menor para o maior.  
		            for(int i = 1; i < linha2.length; i++){  
		                if(linha2[i - 1] > linha2[i]){  
		                    int temp = linha2[i -1];  
		                    linha2[i - 1] = linha2[i];  
		                    linha2[i] = temp;  
		                    flag = true;  
		                }  
		            }  
		        }while (flag);  
		          
		      do{  
		          flag = false;  
		          //laço de repetição for para percorrer o vetor e ordenar do menor para o maior.  
		          for(int i = 1; i < linha3.length; i++){  
		              if(linha3[i - 1] > linha3[i]){  
		                  int temp = linha3[i -1];  
		                  linha3[i - 1] = linha3[i];  
		                  linha3[i] = temp;  
		                  flag = true;  
		              }  
		          }  
		      } while(flag);  
		   
		      do{  
		          flag = false;  
		          //laço de repetição for para percorrer o vetor e ordenar do menor para o maior.
		          for(int i = 1; i < linha4.length; i++){  
		              if(linha4[i - 1] > linha4[i]){  
		                  int temp = linha4[i -1];  
		                  linha4[i - 1] = linha4[i];  
		                  linha4[i] = temp;  
		                  flag = true;  
		              }  
		          }  
		      }while (flag);  
		      
		      soma = linha1[0] + linha2[0] + linha3[0] + linha4[0];
		      System.out.println("Resultado:" + " " + linha1[0] + " + " + linha2[0] + " + " + linha3[0] + 
		    		                        " + " + linha4[0] + " = " + soma);  
	    }
}    
		
		  
			  
		  
		
		  
	  
		  

