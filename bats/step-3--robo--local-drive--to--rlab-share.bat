@echo off
rem file : 20230501`0924 (after 20230415`1114 .. 20210907`1155)
rem ref : https://pureinfotech.com/exclude-files-folders-robocopy-windows-10/
rem usage : Run this in RemoteLAB. It copies the course files from local drive to RemoteLAB
rem          - R: represents the local folder, provided as share by RDP connetion
rem          - S: represents the trainer share

@echo on

robocopy R:\lf11a_20230502 S:\lf11a_20230502 /MIR /XD R:\lf11a_20230502\.svn R:\lf11a_20230502\.git

pause
