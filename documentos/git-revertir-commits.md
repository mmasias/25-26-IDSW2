# Tutorial: Cómo revertir commits erróneos en Git

## Situación

Hay un commit en GitHub que se quiere eliminar, y el local está atrás en un commit anterior.

---

## Método 1: Force Push

**Cuándo usarlo**: Cuando el remoto tiene commits que no se desean y el local está en el estado correcto.

```bash
# 1. Verificar que se está en la rama correcta
git branch

# 2. Ver el historial local vs remoto
git log --oneline -5
git log origin/main --oneline -5

# 3. Hacer force push (sobrescribe el remoto con el local)
git push --force origin main

# O la forma más segura (si otros están trabajando en la rama):
git push --force-with-lease origin main
```

> **Advertencia**: `--force` reescribe el historial y puede causar problemas si otros están trabajando en la misma rama.

---

## Método 2: Git Reset

**Cuándo usarlo**: Cuando se quieren deshacer commits localmente antes de subir al remoto.

```bash
# Volver atrás 1 commit (mantener cambios en staging)
git reset --soft HEAD~1

# Volver atrás 1 commit (mantener cambios sin staging)
git reset HEAD~1

# Volver atrás 1 commit (eliminar cambios completamente)
git reset --hard HEAD~1

# Volver a un commit específico
git reset --hard <commit-hash>
```

---

## Comandos útiles para investigar

```bash
# Ver diferencias con el remoto
git diff origin/main

# Ver qué commits tiene el remoto y no el local
git log HEAD..origin/main

# Ver qué commits tiene el local y no el remoto
git log origin/main..HEAD

# Ver estado completo
git status
```

---

## Resumen de pasos

1. Identificar qué commits tiene el remoto y no el local
2. Confirmar que se quieren eliminar
3. Ejecutar `git push --force origin main`
4. El remoto se iguala al estado local
