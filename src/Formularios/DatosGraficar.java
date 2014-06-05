package Formularios;

public class DatosGraficar {
    public static int Tipo;
    public static double Cantidad;
    public static int Anio;
    
    //Globalizacion para Proyectos VAN
    private static String nombres;
    private static double CostoInicial;
    private static double CostoAnual;
    private static double ValorSalvamento;
    private static double VidaU;
    private static int Evento;
    
    public void setEvento(int eventos)
    {
        
        DatosGraficar.Evento = eventos;
    }
    
    public String getNombre()
    {
        return nombres;
    }
    
    public double getValor1()
    {
        return CostoInicial;
    }
    
    public double getValor2()
    {
        return CostoAnual;
    }
    
    public double getValor3()
    {
        return ValorSalvamento;
    }
    
    public double getValor4()
    {
        return VidaU;
    }
    
    public int getValor5()
    {
        return Evento;
    }
    
    public void setValores(double CostoInicials, double CostoAnuals, double ValorSalvamentos, double VidaUs)
    {
        DatosGraficar.CostoInicial = CostoInicials;
        DatosGraficar.CostoAnual = CostoAnuals;
        DatosGraficar.ValorSalvamento = ValorSalvamentos;
        DatosGraficar.VidaU = VidaUs;
    }
    
    public void setNombre(String nombres)
    {
        DatosGraficar.nombres = nombres;
    }
    
}