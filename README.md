# Ultimate Feature Extractor - Bachelor Project 2019-20
Feature extractor for Android Applications

## Getting Started
The following content provides information on how to get started in using the Ultimate Feature Extractor tool.

### Prerequisites
The project requires that Python 3 and Pipenv are installed in the work environment.

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
You can navigate to the configuration file `settings.ini` and configure the tool to toggle components you want to enable or disable for your execution. To enable a component provide `yes` as a parameter otherwise it is not enabled. We provide a default configuration and this configuration step is optional.

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
