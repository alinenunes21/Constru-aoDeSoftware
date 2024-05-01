0. Configure seu nome e e-mail:


C:\Users\User>git config --global user.name "alinenunes21"

C:\Users\User>git config --global user.email "alinenunes21@hotmail.com"



1. Crie uma pasta chamada cs-aulagit
cd Desktop
mkdir cs-aulagit



2. Entre na pasta e inicie um repositório local
cd cs-aulagit
git init




3. Verifique se o repositório foi criado

	dir /a
24/03/2024  17:54    <DIR>          .git

	



4. Remova o repositório


    rmdir /s .git




5. Crie o repositório novamente
git init



6. Crie um arquivo chamado cs.txt e na primeira linha adicione o seu nome.
notepad cs.txt


7. Verifique se o status do arquivo é "Untracked files" (Status: work directory)
C:\Users\User\Desktop\cs-aulagit>git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        cs.txt

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\User\Desktop\cs-aulagit>



8. Adiciona o arquivo ao "Stage" e verifique o status novamente (agora deve ser "Changes to be committed" - que indica a etapa de Staging area)
git add cs.txt
git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   cs.txt


9. Faça o commit desse arquivo no seu repositório local. Coloque o comentário "Arquivo cs.txt criado com o meu nome"
git commit -m "Arquivo cs.txt criado com o meu nome"



10. Verifique o status do repositório

	git status
On branch master
nothing to commit, working tree clean



11. Verifique os arquivos sob o controle do git

	C:\Users\User\Desktop\cs-aulagit>git ls-files
cs.txt

C:\Users\User\Desktop\cs-aulagit>



11. Altere o arquivo cs.txt: inclua uma nova linha com o nome da disciplina.

notepad cs.txt

12. Crie um novo arquivo chamado engenharia-software.txt e no conteúdo dê uma descrição do curso (2 ou 3 linhas).

notepad engenharia-software.txt

13. Verifique o satus dos dois arquivos e procure entender a diferença
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   cs.txt


C:\Users\User\Desktop\cs-aulagit>git commit -m "Arquivo cs.txt criado com o meu nome"
[master (root-commit) f4c9ebe] Arquivo cs.txt criado com o meu nome
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 cs.txt

C:\Users\User\Desktop\cs-aulagit>git status
On branch master
nothing to commit, working tree clean

C:\Users\User\Desktop\cs-aulagit>git ls-files
cs.txt

C:\Users\User\Desktop\cs-aulagit>notepad cs.txt

C:\Users\User\Desktop\cs-aulagit>notepad engenharia-software.txt

C:\Users\User\Desktop\cs-aulagit>git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        engenharia-software.txt

nothing added to commit but untracked files present (use "git add" to track)

 o arquivo "cs.txt" se tornou parte do repositório Git. No entanto, como o arquivo "engenharia-software.txt" foi criado após o último commit e não foi adicionado ao staged area, o Git o considera como um arquivo não rastreado.


14. 
C:\Users\User\Desktop\cs-aulagit>git ls-files
cs.txt
só ele está comitado para o git, o outro não foi ainda, e por isso ele não aparece

15. Adicione os dois arquivo para "Staged area": 

	git add .



16. Retorne o arquivo cs.txt para a etapa de Work directory

	git reset cs.txt



17. Verifique o status e "entenda" que os dois arquivos estão em etapa diferentes (Work Directory e Staged area)


C:\Users\User\Desktop\cs-aulagit>git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   engenharia-software.txt
        Quando é executado o comando git status após o git reset cs.txt, "engenharia-software.txt" está na staged area e pronto para ser commitado, enquanto o arquivo "cs.txt" não está mais na staged area e tem alterações não adicionadas (unstaged) no diretório de trabalho.Portanto, os dois arquivos estão em etapas diferentes: "engenharia-software.txt" está na staged area e "cs.txt" está no diretório de trabalho com alterações não adicionadas.

18. Adicione no arquivo cs.txt mais uma linha: "INF - Instituto de Informatica"
notepad cs.txt

19. "Mova" esse arquivo para Staged
git add cs.txt



20. Faça o commit dos dois arquivos com o seguinte comentário: "Definição do Curso de Engenharia de Software do INF"
 1 file changed, 1 insertion(+)
 create mode 100644 engenharia-software.txt

C:\Users\User\Desktop\cs-aulagit>git add cs.txt

C:\Users\User\Desktop\cs-aulagit>git add cs.txt

C:\Users\User\Desktop\cs-aulagit>git add engenharia-software.txt

C:\Users\User\Desktop\cs-aulagit>git commit -m "Definição do Curso de Engenharia de Software do INF"
[master a9e685c] Definição do Curso de Engenharia de Software do INF
 1 file changed, 3 insertions(+)



21. Verifique o "log" de mudanças

	git log

commit a9e685c25f4f82dfa575a5465f24d2c2eabb9078 (HEAD -> master)
Author: alinenunes21 <alinenunes21@hotmail.com>
Date:   Sun Mar 24 18:47:22 2024 -0300

    Definição do Curso de Engenharia de Software do INF

commit 140176fe893176dc6f9d20a11e7c801da0ac20d5
Author: alinenunes21 <alinenunes21@hotmail.com>
Date:   Sun Mar 24 18:44:56 2024 -0300

    movendo

commit f4c9ebece801512b49547f0820ad81eb96637470
Author: alinenunes21 <alinenunes21@hotmail.com>
Date:   Sun Mar 24 18:20:47 2024 -0300

    Arquivo cs.txt criado com o meu nome

22. Verifique o "log" de mudanças do arquivo "cs.txt"

C:\Users\User\Desktop\cs-aulagit>git log --follow --stat -- cs.txt
commit a9e685c25f4f82dfa575a5465f24d2c2eabb9078 (HEAD -> master)
Author: alinenunes21 <alinenunes21@hotmail.com>
Date:   Sun Mar 24 18:47:22 2024 -0300

    Definição do Curso de Engenharia de Software do INF

 cs.txt | 3 +++
 1 file changed, 3 insertions(+)

commit f4c9ebece801512b49547f0820ad81eb96637470
Author: alinenunes21 <alinenunes21@hotmail.com>
Date:   Sun Mar 24 18:20:47 2024 -0300

    Arquivo cs.txt criado com o meu nome

 cs.txt | 0
 1 file changed, 0 insertions(+), 0 deletions(-)

C:\Users\User\Desktop\cs-aulagit>

23. Altere o arquivo "cs.txt" adicionando a seguinte linha: "UFG - Universidade Federal de Goiás"

notepad cs.txt

24. Verifique a diferença entre a versão "comitada" e a versão atual do arquivo cs.txt

	git diff cs.txt

diff --git a/cs.txt b/cs.txt
index 7fb80b1..ff38e13 100644
--- a/cs.txt
+++ b/cs.txt
@@ -1,3 +1,4 @@
 Aline
 Engenharia de software
  "INF - Instituto de Informatica"
+"UFG - Universidade Federal de Goiás"^M

a ultima linha com o + é a diferença, foi a ultima linha adicionada.

25 git add .


26. Volte o arquivo cs.txt para a área de staged. 

	git restore --staged cs.txt



27. Agora mova o arquivo para a area de Staged e depois faça o commit. Não esqueça o comentário:

	git add cs.txt

	git commit -m "enviando"



28. Veja os branches existentes

	git branch
C:\Users\User\Desktop\cs-aulagit>git branch
* master


29. Crie um novo "branch" chamado "develop" e entre nele

	git checkout -b develop

C:\Users\User\Desktop\cs-aulagit>git checkout -b develop
Switched to a new branch 'develop'

30. Vejas os branches existentes
C:\Users\User\Desktop\cs-aulagit>git branch
* develop
  master



31. Faça uma mudança no arquivo "engenharia-software.txt". Adicione uma linha com a carga horaria total do curso.

notepad engenharia-software.txt


32. Crie um outro arquivo com o nome estudo-git.txt e, dentro dele, explique brevemente o comando "git status"

notepad estudo-git.txt


33. Verifique o status dos arquivos

	git status

On branch develop
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   engenharia-software.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        estudo-git.txt

no changes added to commit (use "git add" and/or "git commit -a")

C:\Users\User\Desktop\cs-aulagit>

34. Move os arquivos para Staged area e depois faça o commit.
git add .
git commit -m "finalizando"


35. Mude para a branch master

	git checkout master



36. Verifique se o arquivo "estudo-git.txt" está na branch master.

	git ls-files

C:\Users\User\Desktop\cs-aulagit>git ls-files
cs.txt
engenharia-software.txt}
Não está, visto que ela foi criada em outra branch.

37. Verifique se a mudança realizada existe no arquivo "engenharia-software.txt". Pesquise/pergunte se não conseguiu entender o motivo da mudança não constar aqui.
não está listada a ultima mudança, porque estava em outra branch


38. Faça o "merge" das mudanças realizadas no "develop" para a branch "master"
git merge develop


	38.1 Certifique-se que está na master

		  git branch



    38.2. Faça o merge

          git merge develop



39. Apague a branch "develop"

	git branch -D develop



40. Verifique se a branch foi excluída

	git branch
    C:\Users\User\Desktop\cs-aulagit>git branch
* master