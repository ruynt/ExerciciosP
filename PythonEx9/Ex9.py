from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Imprimindo Relatório:\n{self.conteudo}")

class Contrato(Imprimivel):
    def __init__(self, partes):
        self.partes = partes

    def imprimir(self):
        print(f"Imprimindo Contrato:\n{self.partes}")

relatorio = Relatorio("Este é o conteúdo do relatório.")
contrato = Contrato("Parte A e Parte B assinam o contrato.")

relatorio.imprimir()
contrato.imprimir()
