package modelo;


// Marconi

public class Direccion
{
  private int id;
  private String lat;
  private String lng;
  private String calle;
  private int numero;
  private int codigo_postal;
  private String ciudad;

  public Direccion(int id, String lat, String lng, String calle, int numero, int codigo_postal, String ciudad)
  {
    this.id = id;
    this.lat = lat;
    this.lng = lng;
    this.calle = calle;
    this.numero = numero;
    this.codigo_postal = codigo_postal;
    this.ciudad = ciudad;
  }

  /* GETTERS */

  public int getId()
  {
    return id;
  }

  public String getLat()
  {
    return lat;
  }

  public String getLng()
  {
    return lng;
  }

  public String getCalle() 
  {
    return calle;
  }

  public int getNumero()
  {
    return numero;
  }

  public int getCodigoPostal()
  {
    return codigo_postal;
  }

  public String getCiudad()
  {
    return ciudad;
  }

  /* SETTERS */

  public void setId(int id)
  {
    this.id = id;
  }

  public void setLat(String lat)
  {
    this.lat = lat;
  }

  public void setLng(String lng)
  {
    this.lng = lng;
  }

  public void setCalle(String calle)
  {
    this.calle = calle;
  }

  public void setNumero(int numero)
  {
    this.numero = numero;
  }

  public void setCodigoPostal(int codigo_postal)
  {
    this.codigo_postal = codigo_postal;
  }

  public void setCiudad(String ciudad)
  {
    this.ciudad = ciudad;
  }
}