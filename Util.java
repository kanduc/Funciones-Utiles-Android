package com.kadroid.utilitarios.android.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.widget.Toast;

public class Util {
	
	public static void mostrarToast(String mensaje, Context context) {
		
		int duracion = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, mensaje, duracion);
		toast.show();
	}
	
	public static PackageInfo getInformacionPaquete(Context context) {
		
		PackageInfo paquete = null;
		try {
			paquete = context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0);
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return paquete;

	}

}
