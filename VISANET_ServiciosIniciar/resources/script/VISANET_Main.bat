@ECHO OFF

REM **************************************************************
REM * - DESCRIPCION: Shell para la ejecucion de componentes JAVA *
REM * - EJECUCION:   SHELL    								     *
REM * - AUTOR:       Cesar Ricardo Guerra Arnaiz   		  	 	 *
REM * - FECHA:       05/07/2018				      				 *
REM * - VERSION:     1.0									     *
REM **************************************************************

SET vFECHA=%DATE%
SET vHORA=%TIME%
 
SET vFECHA_ACTUAL=%vFECHA% [%vHORA%]
SET vTRANSACCION=%vFECHA_ACTUAL% - [INFO]: 

SET vRUTA=C:\WORKSPACE_Eclipse\VISANET_PROPUESTA\VISANET_ServiciosIniciar\resources\script\
          
ECHO. 
@ECHO %vTRANSACCION% -------------------- [INICIO] --------------------
ECHO.

@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'SHELL' [VISANET_configServer.bat] ...
START %vRUTA%VISANET_configServer.bat

@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'SHELL' [VISANET_bootAdminServer.bat] ...
START %vRUTA%VISANET_bootAdminServer.bat

@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'SHELL' [VISANET_eurekaServer.bat] ...
START %vRUTA%VISANET_eurekaServer.bat



@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'SHELL' [VISANET_dummyREST_Ins_9002.bat] ...
START %vRUTA%VISANET_dummyREST_Ins_9002.bat

@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'SHELL' [VISANET_dummySOAP_Ins_9003.bat] ...
START %vRUTA%VISANET_dummySOAP_Ins_9003.bat
 

ECHO.
@ECHO %vTRANSACCION% --------------------- [FIN] ----------------------

ECHO Pulsar para cerrar ....
PAUSE > NULL

EXIT

