from Ex1Func import calc_pagar
from Ex1Func import calc_valor


preço = float(input("Digite o preço da mercadoria:"))
desconto = float(input("Digite o percentual de desconto:"))
a = calc_valor(preço, desconto)
b = calc_pagar(preço, a)
# valor_do_desconto = preço * desconto / 100;
# a_pagar = preço - valor_do_desconto;
print(f"Um Desconto de", desconto, " em uma mercadoria de R$ ", preço)
print(f"vale R$ ", a, ".")
print(f"O valor a pagar é de R$", b)
print(f'Um Desconto de {desconto}  em uma mercadoria de R$ {preço}')