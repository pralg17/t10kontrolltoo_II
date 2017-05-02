package tanel;

import javax.persistence.*;

@Entity
@Table(name="toiduained")
public class toit{
    @Id
    public String nimetus;
    public int valk;
    public int rasv;
    public int sysivesik;

    public toit() {
               this.nimetus = nimetus;
               this.valk = valk;
               this.rasv = rasv;
               this.sysivesik = sysivesik;
    }
}