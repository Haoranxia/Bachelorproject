# Ultimate Feature Extractor - Bachelor Project 2019-20
Feature extractor for Android Applications (Static features)

## Getting Started
The following content provides information on how to get started in using the Ultimate Feature Extractor tool.

### Prerequisites
The project requires that Python 3 and Pipenv are installed in the work environment. The tool has been tested and performs as intended on both Windows 10 and Ubuntu (`xubuntu-18.04.4`).

### Installation
Follow the following steps to install the tool:
1. Download or clone the project from git.
	```
	git clone https://github.com/Haoranxia/Bachelorproject.git
	```
2. Navigate to where the tool is downloaded and create/activate Pipenv environment.
	```
	pipenv shell
	```
### Configuration
You can navigate to the configuration file `settings.ini` and configure the tool to toggle components you want to enable or disable for your execution. To enable a component provide "`yes`" as a parameter otherwise it is taken as not enabled. We provide a default configuration and this configuration step is optional.

### Execution
You can execute the tool in either one of the following two modes:
1. Single APK execution mode
	```
	python main.py -sAPK <path-to-apk>
	```
	or
	```
	python main.py -sourceAPK <path-to-apk>
	```
2. Batch execution  mode
	```
	python main.py -s <path-to-apks-folder>
	```
	or
	```
	python main.py -sourceFoldr <path-to-apks-folder>
	```
### Output
After execution, the produced reports and features are presented in `csv` or `json` format in a folder named `output`. The contextual and static features are presented within the folders `contexual_out` and `static_out` respectively.

## Notes
* Contextual component uses three API tokens for the three virus scanning services in use. These API tokens can be provided through the `settings.ini` configuration file. We provide a default API tokens and the account linked to these API tokens has Username: `featureextractor.rug1920@gmail.com` and Password: `Featureextractor1920`.
* The tools that we use are packaged with the tool. Custom paths for these tools can be provided via the configuration file. Otherwise, the tool should be ready for use out of the box (following the installation instructions).
* The string literals feature (sub-component) presents the all string constants present for within given application and it is therefore it is advisable to use it for relatively small sample sets.
* For detecting string obfuscation (in particular obfuscation that involves invoking embedding executable code within string literals), we use simple patterns which can be extended/modified. These patterns are found under resources folder under the file: [string obfuscation sentinel list.ini](https://github.com/Haoranxia/Bachelorproject/blob/development/resources/string_obfuscation_sentinel_list.ini)
* You can set the Debug mode to `TRUE` in the configuration file to receive a more verbose log information.


