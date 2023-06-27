@echo off
rem file : 20230501`0925 (after 20230415`1115 .. 20210907`1156)
rem ref : pureinfotech.com/exclude-files-folders-robocopy-windows-10/
rem usage : This copies from RemoteLAB to local drive
rem usage : Run this in RemoteLAB. It copies the course files from RemoteLAB to local drive
rem          - R: represents the local folder, provided as share by RDP connetion
rem          - S: represents the trainer share

echo Attention. This will copy from RemoteLAB to local folder. Really continue?
pause

@echo on

robocopy S:\lf11a_20230502 R:\lf11a_20230502 /MIR /XD S:\lf11a_20230502\assets\daftari

pause
