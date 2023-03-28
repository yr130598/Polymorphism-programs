package com.DynamicBinding;
public class OverridingChild extends OverridingParent{
	@Override
	public void CandidateID() {
		System.out.println("Candidate Id : 5342");
		super.CandidateID();
	}
     @Override
    public void Candidatename() {
    	System.out.println("Candidate Name : Brando");
    	super.Candidatename();
    }
     @Override
    public void Technology() {
    	System.out.println("Candidate Experienced in : Java ");
    	super.Technology();
    }
     public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.CandidateID();
		oc.Candidatename();
		oc.Technology();
	}
}
