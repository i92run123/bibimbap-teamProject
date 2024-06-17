from setuptools import setup, find_packages

setup(
    name='my_package',
    version='1.0.0',
    packages=find_packages(),
    install_requires=[
    'package1>=1.0.0',
    'package2>=1.0.0,<3.0.0',  # package2의 버전 범위를 조정
],
)