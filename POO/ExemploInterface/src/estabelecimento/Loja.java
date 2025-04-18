package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();
        Copiadora Copiadora = new EquipamentoMultiFuncional();
        Digitalizadora digitalizadora = new EquipamentoMultiFuncional();


        impressora.imprimir();
        Copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
