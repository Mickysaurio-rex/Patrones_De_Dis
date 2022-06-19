package visitor.practice;

public class Italia implements IPais {
    String name;
    double cambioC;
    double cambioV;

    @Override
    public void accept(IPersona visitor, String operacion) {
        if(operacion.equals("Cambiar a dolar")){
            visitor.cambioD(this);
        }else if(operacion.equals("Cambiar a moneda local")){
            visitor.cambioL(this);
        }else{
            System.out.println("Esta operacion no existe");
        }
    }

    @Override
    public void setCambioC(Double monto) {
        this.cambioC = monto;
    }

    @Override
    public void setCambioV(Double monto) {
        this.cambioV = monto;
    }

    public double getCambioC() {
        return cambioC;
    }

    public double getCambioV() {
        return cambioV;
    }
}
