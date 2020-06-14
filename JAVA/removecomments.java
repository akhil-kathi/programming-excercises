
/** java doc comments*/
/*
Program to remove comments 
*/
import java.io.*;

class removecomments
{
public static void main(String[]args){

    System.out.println("Program to remove comments // /* */ /** */");
		try
		{
			FileInputStream fin=new FileInputStream("removecomments.java");
			FileOutputStream fout=new FileOutputStream("withoutcomments.java");
			try 
			{
				while(true) 
				{
					int data=fin.read(),data1=0; 	// reads a byte at a time
					if(data == -1)	break; 	// end of input file

					/*
						nested comments
						// test
						testing
					*/

					// To check for comment
				
					if((char)data=='/')
					{
						data1=data;
                      data=fin.read();
                             //comments //
						 if((char)data=='/')
						 {
                             data=fin.read();
							  while((char)data!='\n')
							  data=fin.read();
                              data1=(int)' ';
						  }
             //comments /* /**
						else if(	(char)data=='*')
						{
              	                while(true)
							    {   
                                data1=data;
								data=fin.read();            
                 	                  if((char)data1=='*'&&(char)data=='/')
									   break;
							    }
                       data=fin.read();
						}
                      else 
                     {
                          fout.write(data1);
                          fout.write(data);
                          continue;
                     }
          }
            
	        //Comment adjustment within ""double quotes						
          if((char)data=='"')
          { 
            fout.write(data);
            data=fin.read();
            while((char)data!='"')
            {
                fout.write(data); 
                data=fin.read();
            }
          } 
          if(data1==-1)
             break;
	
  				fout.write(data); 		// writes a byte at a time
				}
			}
			catch(IOException ie) 
			{
            System.out.println("IO EXCEPTION");}
			finally 
			{
				fin.close();  	// close all the streams before exiting
				fout.close();	
				System.out.println("Program ends");
			}
		}
		catch(Exception e)
		{}
	}
}
