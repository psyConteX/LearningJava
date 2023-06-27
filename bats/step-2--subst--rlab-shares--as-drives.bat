@echo off
rem file : 20230501`0923 (after 20230415`1113 .. 20210907`1154)
rem usage : Run this on the RemoteLAB to configure the drive letters.
rem          - R: represents the local folder, provided as share by RDP connetion
rem          - S: represents the trainer share
@echo on

subst R: /D
subst S: /D

subst R: \\tsclient\R
subst S: \\10.100.0.1\Share\Trainer\Maier

pause
