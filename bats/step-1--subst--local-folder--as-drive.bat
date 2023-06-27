@echo off
rem file : 20230501`0922 (after 20230415`1112 .. 20210907`1154)
rem usage : Run this on the local machine. It provides the course folder as drive R:.
@echo on

if exist R:\ (
   subst R: /D
)

subst R: G:\work\~kurse

pause
