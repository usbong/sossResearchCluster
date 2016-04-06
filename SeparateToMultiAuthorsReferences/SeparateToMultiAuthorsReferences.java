import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
Instructions:
Separate multiple-authored publications into their own lines in the output. Keep the same title of the publication.
Publications with only 1 author remain the same.

Input file:
Label;Label;Title
"Alston, J.M., G.W. Norton, and P.G. Pardey;Alston, J.M., G.W. Norton, and P.G. Pardey;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting."

Output file:
Label;Label;Title
Alston, J.M;Alston, J.M;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.
G.W. Norton;G.W. Norton;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.
P.G. Pardey;P.G. Pardey;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.
*/ 
public class SeparateToMultiAuthorsReferences {	
	static boolean in_debug_mode = false;
	static String reference0 = "citationsNodeBordey";
	
	public static void main ( String[] args ) throws Exception
	{
		PrintWriter writer = new PrintWriter(reference0+"Output.txt", "UTF-8");
		
		File f = new File(reference0+"New.txt");
		Scanner sc = new Scanner(new FileInputStream(f));				
		String s;
		while (sc.hasNextLine()) {
			s=sc.nextLine();
			
			//retrieve the authors
			String[] parts = s.split(";");
			
			//using ".," as the delimiter, separate the authors
			String[] authors_dotComma = parts[1].split("\\.,");
			writer.print(authors_dotComma[0].trim()+";"+authors_dotComma[0].trim()+";"+parts[parts.length-1].trim().replaceAll("\"","")+"\n");

//			System.out.println("authors_dotComma.length: "+authors_dotComma.length);
			int start=0;
			if (authors_dotComma.length>1) {
				start=1;
			}
			else {
				continue; //there is only 1 author
			}
			for (int i=start; i<authors_dotComma.length; i++) {					
//				System.out.println("authors_dotComma[i]: "+authors_dotComma[i]);

				//using "," as the delimiter, separate the authors
				String[] parts2 = authors_dotComma[i].split(",");				
				for (int j=0; j<parts2.length; j++) { 
//					System.out.println("parts2[j]: "+parts2[j]);
					writer.print(parts2[j].trim().replace("and ","")+";"+parts2[j].trim().replace("and ","")+";"+parts[parts.length-1].trim().replaceAll("\"","")+"\n");
				}					
			}			
		}			
		sc.close();
		writer.close();
	}
}