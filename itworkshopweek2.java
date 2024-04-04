user@sai-kumar:~$ cat nam.txt
cat: nam.txt: No such file or directory
user@sai-kumar:~$ cat > nam.txt
sai
1
rama
2
^C
user@sai-kumar:~$ cat nam.txt
sai
1
rama
2
user@sai-kumar:~$ sor -n nam.txt

Command 'sor' not found, but can be installed with:

sudo apt install pccts

user@sai-kumar:~$ sor n nam.txt

Command 'sor' not found, but can be installed with:

sudo apt install pccts

user@sai-kumar:~$ sor  nam.txt

Command 'sor' not found, but can be installed with:

sudo apt install pccts

user@sai-kumar:~$ sort  nam.txt
1
2
rama
sai
user@sai-kumar:~$ sort -n nam.txt
rama
sai
1
2
user@sai-kumar:~$ sort -nr nam.txt
2
1
sai
rama
user@sai-kumar:~$ cat > sedfile.txt
sai patel
^C
user@sai-kumar:~$  sed 's/sai/ sedfile.txt
> cat > sedfile.txt
> ^C
user@sai-kumar:~$ sed 's/sai/ sedfile.txt
> ^C
user@sai-kumar:~$ sed 's/sai/SAI/ sedfile.txt
> ^C
user@sai-kumar:~$ sed 's/sai/SAI/' sedfile.txt
SAI patel
user@sai-kumar:~$ sed /sai/SAI/' sedfile.txt
> ^C
user@sai-kumar:~$ 
user@sai-kumar:~$ sed '/SAI/d' sedfile.txt
sai patel
user@sai-kumar:~$ sed /sai/SAI/' sedfile.txt
> ^C
user@sai-kumar:~$ sed 's/sai/SAI/' sedfile.txt
SAI patel
user@sai-kumar:~$ cat >awk.txt
nag army at madras in india
^C
user@sai-kumar:~$ cat >awkfile.txt
nag  widow  id  2456    
ajay sort id 123
vijay soft id 3443
sonnu emp it 176
^C
user@sai-kumar:~$ cat awkfile.txt
nag  widow  id  2456
ajay sort id 123
vijay soft id 3443
sonnu emp it 176
user@sai-kumar:~$ awk '{print $1,$4}' awkfile.txt
nag 2456
ajay 123
vijay 3443
sonnu 176
user@sai-kumar:~$ cat >a.txt
^C
user@sai-kumar:~$ awk '/nag/ {print}' awkfile.txt
nag  widow  id  2456
user@sai-kumar:~$ awk '/nag/ {print $1}' awkfile.txt
nag


