// Generated from jQueryParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jQueryParserParser}.
 */
public interface jQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(jQueryParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(jQueryParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(jQueryParserParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(jQueryParserParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(jQueryParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(jQueryParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(jQueryParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(jQueryParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(jQueryParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(jQueryParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(jQueryParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(jQueryParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(jQueryParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(jQueryParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(jQueryParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(jQueryParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(jQueryParserParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(jQueryParserParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(jQueryParserParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(jQueryParserParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(jQueryParserParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(jQueryParserParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(jQueryParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(jQueryParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(jQueryParserParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(jQueryParserParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(jQueryParserParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(jQueryParserParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(jQueryParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(jQueryParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(jQueryParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(jQueryParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(jQueryParserParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(jQueryParserParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(jQueryParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(jQueryParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(jQueryParserParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(jQueryParserParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(jQueryParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(jQueryParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(jQueryParserParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(jQueryParserParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(jQueryParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(jQueryParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(jQueryParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(jQueryParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(jQueryParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(jQueryParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(jQueryParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(jQueryParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(jQueryParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(jQueryParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(jQueryParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(jQueryParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(jQueryParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(jQueryParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(jQueryParserParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(jQueryParserParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(jQueryParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(jQueryParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(jQueryParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(jQueryParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(jQueryParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(jQueryParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(jQueryParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(jQueryParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(jQueryParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(jQueryParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(jQueryParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(jQueryParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(jQueryParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(jQueryParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(jQueryParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(jQueryParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(jQueryParserParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(jQueryParserParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(jQueryParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(jQueryParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(jQueryParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(jQueryParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(jQueryParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(jQueryParserParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(jQueryParserParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(jQueryParserParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(jQueryParserParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(jQueryParserParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(jQueryParserParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(jQueryParserParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(jQueryParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(jQueryParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(jQueryParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(jQueryParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(jQueryParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(jQueryParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(jQueryParserParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(jQueryParserParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(jQueryParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(jQueryParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(jQueryParserParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(jQueryParserParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(jQueryParserParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(jQueryParserParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(jQueryParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(jQueryParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(jQueryParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(jQueryParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(jQueryParserParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(jQueryParserParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(jQueryParserParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(jQueryParserParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(jQueryParserParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(jQueryParserParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(jQueryParserParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(jQueryParserParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(jQueryParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(jQueryParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(jQueryParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(jQueryParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(jQueryParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(jQueryParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(jQueryParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(jQueryParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(jQueryParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(jQueryParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(jQueryParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(jQueryParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(jQueryParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(jQueryParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(jQueryParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(jQueryParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(jQueryParserParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(jQueryParserParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(jQueryParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(jQueryParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(jQueryParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(jQueryParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(jQueryParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(jQueryParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(jQueryParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(jQueryParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jQueryParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jQueryParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(jQueryParserParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(jQueryParserParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(jQueryParserParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(jQueryParserParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(jQueryParserParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(jQueryParserParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(jQueryParserParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(jQueryParserParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(jQueryParserParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(jQueryParserParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(jQueryParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(jQueryParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(jQueryParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(jQueryParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(jQueryParserParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(jQueryParserParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(jQueryParserParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(jQueryParserParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(jQueryParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(jQueryParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(jQueryParserParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(jQueryParserParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(jQueryParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(jQueryParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(jQueryParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(jQueryParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(jQueryParserParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(jQueryParserParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(jQueryParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(jQueryParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(jQueryParserParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(jQueryParserParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jQueryParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jQueryParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(jQueryParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(jQueryParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(jQueryParserParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(jQueryParserParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(jQueryParserParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(jQueryParserParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(jQueryParserParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(jQueryParserParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(jQueryParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(jQueryParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(jQueryParserParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(jQueryParserParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(jQueryParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(jQueryParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(jQueryParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(jQueryParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(jQueryParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(jQueryParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(jQueryParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(jQueryParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(jQueryParserParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(jQueryParserParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(jQueryParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(jQueryParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(jQueryParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(jQueryParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(jQueryParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(jQueryParserParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(jQueryParserParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(jQueryParserParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(jQueryParserParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(jQueryParserParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(jQueryParserParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(jQueryParserParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void enterAssign_selection(jQueryParserParser.Assign_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void exitAssign_selection(jQueryParserParser.Assign_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(jQueryParserParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(jQueryParserParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(jQueryParserParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(jQueryParserParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(jQueryParserParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(jQueryParserParser.OutputContext ctx);
}