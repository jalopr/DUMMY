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
 
ECHO. 
@ECHO %vTRANSACCION% -------------------- [INICIO] --------------------
ECHO.

@ECHO %vTRANSACCION% EJECUTANDO COMANDO 'Servicio' [CINEMAX_eurekaServer-1.0.jar] ...
C:\java\JDK\jdk1.8.0_9\bin\java -jar C:\WORKSPACE_Eclipse\VISANET_PROPUESTA\VISANET_ServiciosIniciar\resources\jars\VISANET_eurekaServer-1.0.jar  
        
ECHO.
@ECHO %vTRANSACCION% --------------------- [FIN] ----------------------

ECHO Pulsar para cerrar ....
PAUSE > NULL

EXIT

