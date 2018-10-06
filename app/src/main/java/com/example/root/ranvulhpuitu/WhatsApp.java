package com.example.root.ranvulhpuitu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class WhatsApp {
    Context context;

    public WhatsApp(Ar_AvianInfluenza ar_avianInfluenza  ){
        context = ar_avianInfluenza;
    }

    public WhatsApp(Ar_Botulism ar_botulism){
        context = ar_botulism;
    }

    public WhatsApp(Ar_EggDropSyndrome ar_eggDropSyndrome   ){
        context = ar_eggDropSyndrome;
    }

    public WhatsApp(Ar_FowlCholera ar_fowlCholera   ){
        context = ar_fowlCholera;
    }

    public WhatsApp(Ar_FowlPox ar_fowlPox   ){
        context = ar_fowlPox;
    }

    public WhatsApp(Ar_InfectiousBronchitis ar_infectiousBronchitis   ){
        context = ar_infectiousBronchitis;
    }

    public WhatsApp(Ar_InfectiousBursalDiseases ar_infectiousBursalDiseases   ){
        context = ar_infectiousBursalDiseases;
    }
    public WhatsApp(Ar_InfectiousCoryza ar_infectiousCoryza   ){
        context = ar_infectiousCoryza;
    }

    public WhatsApp(Ar_InfectiousLaryngotracheitis ar_infectiousLaryngotracheitis   ){
        context = ar_infectiousLaryngotracheitis;

    }

    public WhatsApp(Ar_MarekDisease ar_marekDisease   ){
        context = ar_marekDisease;
    }

    public WhatsApp(Ar_NewcastleDisease ar_newcastleDisease   ){
        context = ar_newcastleDisease;
    }

    public WhatsApp(Ar_Pullorum ar_pullorum   ){
        context = ar_pullorum;
    }

    public WhatsApp(Ar_Staphylococcus ar_staphylococcus   ){
        context = ar_staphylococcus;
    }
    public WhatsApp(Vawk_hnimHringTurNei_kanaan vawk_hnimHringTurNei_kanaan   ){
        context = vawk_hnimHringTurNei_kanaan;
    }

    public WhatsApp(Vawk_hnimHringTurNei_Shillong vawk_hnimHringTurNei_shillong   ){
        context = vawk_hnimHringTurNei_shillong;
    }

    public WhatsApp(Vawk_hnimHringTurNei_Vawk_hnimHringTurNei_TawtawrawtPawl vawk_hnimHringTurNei_vawk_hnimHringTurNei_tawtawrawtPawl   ){
        context = vawk_hnimHringTurNei_vawk_hnimHringTurNei_tawtawrawtPawl;
    }

    public WhatsApp(Vawk_hnimHringTurNei_TawtawrawtVar vawk_hnimHringTurNei_tawtawrawtVar   ){
        context = vawk_hnimHringTurNei_tawtawrawtVar;
    }

    public WhatsApp(Vawk_hnimHringTurNei_Mutih vawk_hnimHringTurNei_mutih   ){
        context = vawk_hnimHringTurNei_mutih;
    }

    public WhatsApp(Vawk_hnimHringTurNei_savaMit vawk_hnimHringTurNei_savaMit   ){
        context = vawk_hnimHringTurNei_savaMit;
    }
    public WhatsApp(Vawk_hnimHringTurNei_Katchat vawk_hnimHringTurNei_katchat  ){
        context = vawk_hnimHringTurNei_katchat;
    }

    public WhatsApp(Vawk_natnaLehHri_PRRS vawk_natnaLehHri_prrs   ){
        context = vawk_natnaLehHri_prrs;
    }

    public WhatsApp(Vawk_natnaLehHri_Rulhut  vawk_natnaLehHri_rulhut  ){
        context = vawk_natnaLehHri_rulhut;
    }

    public WhatsApp(Vawk_natnaLehHri_SakawrEkHrikNatna vawk_natnaLehHri_sakawrEkHrikNatna   ){
        context = vawk_natnaLehHri_sakawrEkHrikNatna;
    }

    public WhatsApp(Vawk_natnaLehHri_VawkPhar vawk_natnaLehHri_vawkPhar   ){
        context = vawk_natnaLehHri_vawkPhar;
    }

    public WhatsApp(Vawk_natnaLehHri_VawkpuiTlusawp vawk_natnaLehHri_vawkpuiTlusawp   ){
        context = vawk_natnaLehHri_vawkpuiTlusawp;
    }
    public WhatsApp(Vawk_natnaLehHri_VawkPulHri vawk_natnaLehHri_vawkPulHri   ){
        context = vawk_natnaLehHri_vawkPulHri;
    }

    public WhatsApp(Vawk_ranInTihfaiDan_Bleaching vawk_ranInTihfaiDan_bleaching   ){
        context = vawk_ranInTihfaiDan_bleaching;
    }

    public WhatsApp(Vawk_ranInTihfaiDan_Chinai vawk_ranInTihfaiDan_chinai   ){
        context = vawk_ranInTihfaiDan_chinai;
    }

    public WhatsApp(Vawk_ranInTihfaiDan_Phenol vawk_ranInTihfaiDan_phenol   ){
        context = vawk_ranInTihfaiDan_phenol;
    }

    public WhatsApp(Vawk_ranInTihfaiDan_Soda vawk_ranInTihfaiDan_soda   ){
        context = vawk_ranInTihfaiDan_soda;
    }

    public WhatsApp(Vawk_ranInTihfaiDan_Sodium vawk_ranInTihfaiDan_sodium   ){
        context = vawk_ranInTihfaiDan_sodium;
    }
    public WhatsApp(Vawk_ranInTihfaiDan_Tuisen vawk_ranInTihfaiDan_tuisen   ){
        context = vawk_ranInTihfaiDan_tuisen;
    }



    public void whatsappSend(){
        try {

            String toNumber = "9436153649";
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + "" + toNumber+ "?body=" + ""));
            sendIntent.setPackage("com.whatsapp");
            context.startActivity(sendIntent);
        }
        catch (Exception e){
            e.printStackTrace();
            // Toast.makeText(MainActivity.this,"it may be you dont have whats app",Toast.LENGTH_LONG).show();

        }
    }
}
