@setlocal
set GENERATED_SOURCE=%1

if "%GENERATED_SOURCE%" == "" goto :usage
if "%GENERATED_SOURCE%" == "/?" goto :usage
if "%GENERATED_SOURCE%" == "/h" goto "usage
if "%GENERATED_SOURCE%" == "/help" goto :usage

set GENERATED_TARGET=%~f2
if "%GENERATED_TARGET%" == "" set GENERATED_TARGET=.
echo %GENERATED_TARGET%

for /D %%F in (%GENERATED_SOURCE%\*) do call :copy_files %%F  %GENERATED_TARGET%\%%~nxF\src\main\generated

goto :done

:usage
echo CopyGenerated source-directory [target-directory]
goto  :eof

:copy_files
rd /S /Q %2
xcopy /Y /S /E %1\* %2\*
goto :eof

:done
goto :eof