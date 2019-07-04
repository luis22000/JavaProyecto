/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;


public class Virtualizacion {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
  public static void main(String[] args) throws InterruptedException {
    
        SigIng ing = new SigIng();
        ing.setVisible(true);
    //validar();
    
    
  }
   
  

 public static void goToURL(String URL) throws IOException, URISyntaxException{
           if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
 
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    
                }
            }
        }
    }
   private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } finally {
      is.close();
    }
  }
  public static void validar()
  {
    Principal verformulario2= new Principal();    
    verformulario2.setVisible(true);
    System.out.println("dawdaw");
  }
  private static HttpURLConnection con;
  public static String RespuestaURLRecognition(String URL,String NombreImagen) throws IOException
  {
      String url = URL +NombreImagen;

        try {

            URL myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            return content.toString();

        } finally {
            
            con.disconnect();
        }
  }
  public static String RespuestaURLSpotify(String URL,String emocion,String clima) throws IOException
  {
      String url = URL;
      double danceabilitye = 0;
      double energye = 0;
      double valencee = 0;
      double acousticnesse = 0;
      double danceabilityc = 0;
      double energyc = 0;
      double valencec = 0;
      double acousticnessc = 0;
      double danceability = 0;
      double energy = 0;
      double valence = 0;
      double acousticness = 0;
      
      if (emocion.equals("ALEGRÍA")){
	danceabilitye = 1.0;
	energye = 1.0;
	valencee =  1.0;
	acousticnesse = 0.5;
}
else if(emocion.equals("PENA")){
	danceabilitye = 0.1;
	energye = 0.4;
	valencee =  0.5;
	acousticnesse = 0.5;
}
else if(emocion.equals("ENOJO")){
	danceabilitye = 0.1;
	energye = 0.8;
	valencee =  0.1;
	acousticnesse = 0.1;
}
else if(emocion.equals("CONFUSIÓN")){
	danceabilitye = 0.4;
	energye = 0.5;
	valencee =  0.4;
	acousticnesse = 0.5;
}
else if(emocion.equals("DISGUSTO")){
	danceabilitye = 0.2;
	energye = 0.7;
	valencee =  0.1;
	acousticnesse = 0.4;
}
else if(emocion.equals("SORPRESA")){
	danceabilitye = 0.9;
	energye = 0.9;
	valencee =  0.9;
	acousticnesse = 0.6;
}
else if(emocion.equals("CALMA")){
	danceabilitye = 0.1;
	energye = 0.1;
	valencee =  1.0;
	acousticnesse = 1.0;
}
else if(emocion.equals("DESCONOCIDA")){
	danceabilitye = 0.5;
	energye = 0.5;
	valencee =  0.5;
	acousticnesse = 0.5;
}
      
    if (clima.equals("Clear")){
	danceabilityc = 1.0;
	energyc = 1.0;
	valencec =  1.0;
	acousticnessc = 0.5;
}
else if(clima.equals("Clouds")){
	danceabilityc = 1.0;
	energyc = 0.8;
	valencec =  0.9;
	acousticnessc = 0.6;
}
else if(clima.equals("Drizzle")){
	danceabilityc = 0.4;
	energyc = 0.3;
	valencec =  0.5;
	acousticnessc = 1.0;
}
else if(clima.equals("Fog")){
	danceabilityc = 0.4;
	energyc = 0.3;
	valencec =  0.5;
	acousticnessc = 0.9;
}
else if(clima.equals("Haze")){
	danceabilityc = 0.3;
	energyc = 0.3;
	valencec =  0.6;
	acousticnessc = 0.9;
}
else if(clima.equals("Rain")){
	danceabilityc = 0.2;
	energyc = 0.5;
	valencec =  0.7;
	acousticnessc = 0.9;
}
else if(clima.equals("Thunderstorm")){
	danceabilityc = 0.2;
	energyc = 0.4;
	valencec =  0.6;
	acousticnessc = 0.5;
}
else if(clima.equals("Snow")){
	danceabilityc = 0.6;
	energyc = 0.6;
	valencec =  0.8;
	acousticnessc = 0.5;
}
else if(clima.equals("Mist")){
	danceabilityc = 0.3;
	energyc = 0.3;
	valencec =  0.5;
	acousticnessc = 0.9;
}

	danceability = (danceabilityc + danceabilitye)/2;
	energy = (energyc + energye)/2;
	valence =  (valencec + valencee)/2;
	acousticness = (acousticnessc + acousticnesse)/2;
        
        try {

            URL myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("danceability", String.valueOf(danceability));
            con.setRequestProperty("energy", String.valueOf(energy));
            con.setRequestProperty("valence", String.valueOf(valence));
            con.setRequestProperty("acousticness", String.valueOf(acousticness));
            
            con.setRequestMethod("GET");

            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            
            return content.toString();

        } finally {
            
            con.disconnect();
        }
  }
}

