import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {

	private Document dom = null;
	private ArrayList<Accion> acciones = null;

	public Parser() {
		acciones = new ArrayList<Accion>();
	}

	public void parseFicheroXML() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse("fichero2.xml");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public void parseDocument() {

		Element docEle = dom.getDocumentElement();

		NodeList nl = docEle.getElementsByTagName("accion");

		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {
				Element el = (Element) nl.item(i);
				//Accion a = getLibro(el);
				//acciones.add(a);
			}
		}
	}

	//private Accion getLibro(Element AccionEle) {
		//String nombre = getTextValue(AccionEle, "nombre");
		//ArrayList<Accion> operaciones = getOperaciones(AccionEle);
		//ArrayList<String> compras = getCompras(AccionEle);
		//ArrayList<Compra> compra = getCompra(AccionEle);
		//ArrayList<Venta> venta = getVenta(AccionEle);
		
		//Accion acc = new Accion(nombre, operaciones, compras, compra, venta);

		//return acc;

	//}

	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textVal = el.getFirstChild().getNodeValue();

		}
		return textVal;

	}

	private int getIntValue(Element ele, String tagName) {
		return Integer.parseInt(getTextValue(ele, tagName));
	}

	//Obtener operaciones
		//private ArrayList<Accion> getOperaciones(Element ele){
			//ArrayList <Accion> acciones = new ArrayList<Accion>();
			
			//NodeList nl = ele.getElementsByTagName("accion");
			//if (nl != null && nl.getLength() > 0) {
					//Obtenemos elemento Accion
				//	Element elA = (Element) nl.item(0);
					
									
			//}

		//}
	public void print() {

		Iterator it = acciones.iterator();

		while (it.hasNext()) {

			Accion l = (Accion) it.next();
			l.imprimir();
		}

	}
	
	public ArrayList<Accion> getAcciones(){
		return this.acciones;
	}
}